How to test
======
Step
-----
*** ขั้นตอนการทดสอบนี้ เป็นขั้นตอนที่ใช้ใน Window เท่านั้น 
###สิ่งที่ต้องเตรียมและติดตั้งก่อนการทดสอบ
1. [Java JDK Version 8 ขึ้นไป](https://www.oracle.com/java/technologies/javase-downloads.html"Java JDK")
2. [Maven](https://maven.apache.org/download.cgi"Maven Download")
### วิธีการ Run Unit Test ด้วย CMD
1. เข้าไปใน Folder ของ depositCash  
```cd depositCash```
2. เรียกใช้คำสั่ง ```mvn test``` เพื่อทดสอบ Unit Test ทั้งหมด  
```mvn test```
### หาก Run แล้วเจอปัญหา ```No compiler is provided in this environment. Perhaps you are running on a JRE rather than a JDK?```
ให้ Set ```JAVA_HOME``` ด้วยคำสั่งนี้  
```set JAVA_HOME=<Path>```  
โดย ```Path``` นั้นจะเป็นที่ตั้งของ Java JDK ที่ติดตั้งอยู่ เช่น  
```set JAVA_HOME=C:\Program Files\Java\jdk-13.0.2```

6110545571 Punyawee Srithongkerd 
                       
