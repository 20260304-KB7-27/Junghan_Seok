package org.scoula.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import java.io.InputStream;
import java.util.Properties;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    // application.properties에서 동적으로 동기화할 변수들
    private String location;
    private long maxFileSize;
    private long maxRequestSize;
    private int fileSizeThreshold;

    public WebConfig() {
        // 교재 요구사항에 맞게 application.properties 파일로부터 직접 설정값을 읽어옵니다.
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("application.properties")) {
            Properties prop = new Properties();
            if (input != null) {
                prop.load(input);
                this.location = prop.getProperty("file.upload.location");
                this.maxFileSize = Long.parseLong(prop.getProperty("file.upload.maxFileSize"));
                this.maxRequestSize = Long.parseLong(prop.getProperty("file.upload.maxRequestSize"));
                this.fileSizeThreshold = Integer.parseInt(prop.getProperty("file.upload.fileSizeThreshold"));
            }
        } catch (Exception e) {
            // 파일 로드 실패 시 교재의 기본 자바 코드로 안전하게 백업(Fallback)합니다.
            this.location = "c:/upload";
            this.maxFileSize = 1024 * 1024 * 10L;
            this.maxRequestSize = 1024 * 1024 * 20L;
            this.fileSizeThreshold = 1024 * 1024 * 5;
        }
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setInitParameter("throwExceptionIfNoHandlerFound", "true");

        // properties 파일에서 동적으로 읽어온 값으로 무비용 세팅 완료!
        MultipartConfigElement multipartConfig =
                new MultipartConfigElement(
                        location,
                        maxFileSize,
                        maxRequestSize,
                        fileSizeThreshold
                );
        registration.setMultipartConfig(multipartConfig);
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return new Filter[]{characterEncodingFilter};
    }
}