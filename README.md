# spring-semaphore
A simple project to kickstart your spring boot and semaphore journey

Note: In testing
1. Run the application by using any idea of your choice (example VSCode)
2. By using postman or any other testing application you can check the validity of the application. Paste the following info accordingly
   Endpoint :
     GET http://localhost:8080/service
4. Sample Response
   - Success
   - Check console log for
     - Before acquiring permit thread 1
     - After acquiring permit thread 1
     - After releasing permit thread 1
     - Before acquiring permit thread 2
     - After acquiring permit thread 2
     - After releasing permit thread 2
     - Before acquiring permit thread 3
     - After acquiring permit thread 3
     - After releasing permit thread 3
     - All threads submitted to executor service
     - Before acquiring permit thread 4
     - After acquiring permit thread 4
     - After releasing permit thread 4
   - Note : Order of execution depends on the handling of executor service
