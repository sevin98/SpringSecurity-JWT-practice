## front구현 없이 api로만 구현(약 1시간 30분 소요)

초기 Database 상태
![image](https://github.com/sevin98/SpringSecurity-JWT-practice/assets/117634128/25abbc36-2ad4-4bf5-95f8-a201eb04a5bd)
___
### 1.
Postman 에서 admin / 1234 로 join(회원가입) POST요청 

![image](https://github.com/sevin98/SpringSecurity-JWT-practice/assets/117634128/6335a677-8791-4ebc-b3b4-10f8bc8ed41a)

HttpStatus 200 Ok

![image](https://github.com/sevin98/SpringSecurity-JWT-practice/assets/117634128/ad26f3f6-0839-4f01-9442-23cb27b6ed13)

database 에 Userid, Username, user_Role, 암호화된 password 가 삽입됨

___
### 2. 
회원가입 후 admin /1234 로 로그인 POST요청

![image](https://github.com/sevin98/SpringSecurity-JWT-practice/assets/117634128/1e610b50-0842-4e67-aff5-b61a2c1cdc84)

HttpStatus 200 OK
Hearders의 Authorization에 Bearer + " JWT암호화된 password" return 확인

___

### 3.
로그인 후 /adimin 으로 GET요청
![image](https://github.com/sevin98/SpringSecurity-JWT-practice/assets/117634128/f6be747b-f62e-4a35-9067-6e14a26035c1)

request시 Authorization에 JWT암호화된 password 포함해 request
admin임을 확인 후 adminController가 잘 출력됨 확인

___
## 짧은 회고
### SpringSecurity와 JWT를 이용해 로그인 api를 구현해보았다. 페이지 구현은 시간 상 따로 진행하지 않았지만, 추후 진행할 프로젝트에서 잘 사용할 수 있을 것 같다.
### 다음으로 oAuth2 관련 소셜로그인을 구현해보는것을 목표로 한다.
