
### Run the RMI registry
Assuming  your machine can run javac, run the following commands to run the RMI registry.


Navigate to the directory where you want to set up the RMI registry
`$ cd ~/ExamSystem/out/production/ExamSystem`

Run the RMI registry
`$ rmiregistry`

### Run the Exam System Server and Client
1. **Running the server** - run the `ExamEngine.java` class
2. **Running the Client** - run the `MathsClient.java` class

### How to use the Exam System
1. If the ExamEngine.java is running, run MathsClient.java
2. Enter your username  and password:
`Username: a`
`Password: a`
3. Following a successful login you are asked:
"Would you like a summary of  assignments?"
`Yes` – gives you a summary of the assignments available to a student
`No`  – you will be logged out
4. If you answered `yes`
Enter the name of the assessment you would like to complete
5. Follow the prompts to complete/submit/re-try the assessment
