# Billing Engine #

## Scenario​ ​Background ## 

#### MediHealth is a private medical centre. They provide the following services: ####

1. Diagnosis
2. X-Ray
3. Blood Test
4. ECG
5. Vaccine


#### Each of the services has an associated default cost ####
1. Diagnosis £60
2. X-Ray £150
3. Blood Test £78
4. ECG £200.40
5. Vaccine £27.50 (service) + £15 (for each vaccine)


#### Discounts are applied for services based on the following criteria: ####
1. Senior citizens (between 65 and 70) receive a 60% discount
2. Senior citizens (over 70) receive a 90% discount
3. Children under 5 receive 40% discount
4. Patients with "MediHealth Health insurance" get additional 15% discount on Blood test
when they are diagnosed by a MediHealth practitioner


### Exercise​:  ####
   
The basis of a new billing engine using the rules
detailed above. MediHealth is expecting the solution to be written in a TDD style using Java or
Scala.


### How To Run ###

Enter Patient Details

```
     $> Patient 66 True
```

Enter Services 

```
    $> service diagnosis
    $> service bloodtest
    $> service vaccine
    $> service vaccine
    $> service xray
   
```
Get Bill
```
    $> getBill
```









