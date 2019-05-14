####HOMEWORK 6
####Parth Mehul Desai

###Instructions
Uses:
Scala
Sbt
Scalapb

Compile using `sbt compile`. This will generate the code in the protobuf folder. Then `sbt run` can be used to run the client.
This sends the message to the Lambda function(not on cloud).

###Design:
There are 2 functions - The client program and the lambda function.

The lambda function comprises of 4 main functions- add, subtract, multiply and divide, which were defined in the proto file. There are 2 message types - CalcRequest, which takes the 2 numbers as doubles and the operator as string and CalcReply, which returns the response in the form of the 2 original numbers, as well as the result and a error message, which is normally empty. 

The data is transfered to and fro in the form of a bytestring, that is converted back to protobuf upon getting to function.


##State information
The last result is stored client side in the form of a double. So, if the M+ function is called, it simply calls addition on the last result and the other number. Same for M-. MClear simply turns the number to 0. The state of number is maintained via getter and setter functions. This is how the function remains stateless. This is done because there is no need to add additional cost and complexity of creating database on server end to store a few numbers. Instead, the state can be maintained client side. However, the disadvantage is that it will not be possible to retain this value after client stops. But I think its a valid compromise.