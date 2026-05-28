package com.sample;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employees {

    private Integer empNo;

    private LocalDate birthDate;

    private String firstName;

    private String lastName;

    private String gender;

    private LocalDate hireDate;

}
