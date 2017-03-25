
### Run the RMI registry
Assuming  your machine can run javac, run the following commands to run the RMI registry.


Navigate to the directory where you want to set up the RMI registry<br />
`$ cd ~/ExamSystem/out/production/ExamSystem`

Run the RMI registry<br />
`$ rmiregistry`

### Run the Exam System Server and Client
1. **Running the server** - run the `ExamEngine.java` class
2. **Running the Client** - run the `MathsClient.java` class

### How to use the Exam System
1. If the ExamEngine.java is running, run MathsClient.java<br />
2. Enter your username  and password:<br />
`Username: a`<br />
`Password: a`<br />
3. Following a successful login you are asked:<br />
"Would you like a summary of  assignments?"<br />
`Yes` – gives you a summary of the assignments available to a student<br />
`No`  – you will be logged out<br />
4. If you answered `yes`<br />
Enter the name of the assessment you would like to complete<br />
5. Follow the prompts to complete/submit/re-try the assessment<br />
