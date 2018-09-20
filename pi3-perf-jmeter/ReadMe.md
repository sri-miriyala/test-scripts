## JMeter scripts for end-to-end testing
This document provides instructions on how the JMeter scripts under test-scripts and the mock-service can be used to perform end-to-end testing (can be used for performance testing).

### Prerequisites
1. Running instances of ml-api-adapter, central-ledger either locally or remotely (Refer to central-ledger documentation on how to run)
2. JMeter basic setup
3. Ability to run the mock service (from jar file)

### Overview
1. JMeter acts as the Payer FSP and sends in the Prepare requests  
a.	[Here](https://github.com/mojaloop/docs/blob/develop/CentralServices/arch_diagrams/Arch-Flows-CS-1b.png) is the architecture diagram for reference.  
b.	The transferIds are generated dynamically and the number of requests that are to be sent should be configured in JMeter (Loop count)  
c.	The amount, payerFSP, payeeFSP, Switch host, port are to be set under the User parameters  
d. Use the (clone the [test-scripts](https://github.com/mojaloop/test-scripts/tree/develop/pi3-perf-jmeter) repo) pi3-ml-adapter-transfers.jmx file from the repo.  
e. The current JMeter script stores the transferIds and the time (in milliseconds) when these are sent in a csv file.  
2. The mock-service accepts the POST /transfers request sent by the Switch (the notification of the payment) and responds with a PUT /transfers/{ID}  
3.	The Switch receives the Fulfilment request (PUT /transfers/{ID} fromt the mock performs the transfer and then sends out notifications  
4.	The mock receives the notifications and stores the ID and the time details(in milliseconds) to a csv file  
5.	Once the tests are run, the generate-analytics appliation can be used to parse the JMeter csv file and the one generated by the mock service and publish the metrics for: Average Response Time, TPS, MinTime, MaxTime, Total number of transactions.