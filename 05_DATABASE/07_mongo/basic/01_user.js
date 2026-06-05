// 1. 데이터베이스를 tutorial로 선정하세요.
use tutorial

// 2. users 컬렉션에 username이 smith인 문서를 저장하세요.
db.users.insert({ username: "smith" })

// 3. users 컬렉션에 username이 jones인 문서를 저장하세요.
db.users.insert({ username: "jones" })

// 4. 앞에서 저장한 모든 문서를 출력하세요.
db.users.find()

// 5. 앞에서 저장한 문서 중 하나만 출력하세요.
db.users.findOne()

// 6. users 컬렉션에서 username이 "jones"인 문서를 찾아서 출력하세요.
db.users.find({ username: "jones" })

// 7. users 컬렉션에서 username이 "jones" 또는 "smith"인 문서를 찾아서 출력하세요.
db.users.find({ username: { $in: ["jones", "smith"] } })

// 8. username이 smith인 문서에 country 키가 Canada가 되도록 수정하세요.
db.users.update({ username: "smith" }, { $set: { country: "Canada" } })

// 9. 앞의 문서가 올바르게 수정되었는지 확인하세요.
db.users.find({ username: "smith" })

// 10. username이 smith인 문서를 {country: "Canada"}로 대체하고 확인하세요.
db.users.update({ username: "smith" }, { country: "Canada" })

// 11. country가 Canada인 문서를 {username: "smith", country: "Canada"}로 대체하고 확인하세요.
db.users.update({ country: "Canada" }, { username: "smith", country: "Canada" })

// 12. username이 smith인 문서에서 country 키를 삭제하고 확인하세요.
db.users.update({ username: "smith" }, { $unset: { country: 1 } })

// 13. 데이터베이스 전체 목록을 출력하세요.
show dbs

// 14. 현재 사용 중인 데이터베이스의 컬렉션 목록을 출력하세요.
show collections

// 15. 현재 사용 중인 데이터베이스와 users 컬렉션의 상태를 출력하세요.
db.stats()
db.users.stats()

// 16. username이 smith인 문서를 삭제하고 확인하세요.
db.users.remove({ username: "smith" })

// 17. users 컬렉션의 모든 문서를 삭제하세요.
db.users.remove({})

// 18. users 컬렉션을 삭제하세요.
db.users.drop()

// 20,000건의 문서 추가
for (var i = 0; i < 20000; i++) {
    db.numbers.insert({ num: i })
}

// 전체 개수 확인
db.numbers.count()