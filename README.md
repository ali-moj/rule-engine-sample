# rule-engine-sample
spring easy rule mvel save in database 
save rules in database 

usage:
  {
      "name": "person rule",
      "description": "person can have insurance",
      "priority": 1,
      "condition": "person.age > 10",
      "action": "personCanHaveInsurance"
  }
  
  curl --location --request POST 'http://localhost:8080/rules/save' \
--header 'Content-Type: application/json' \
--data-raw '  {
      "name": "person rule",
      "description": "person can have insurance",
      "priority": 1,
      "condition": "person.age > 10",
      "action": "personCanHaveInsurance"
    }'
    
  
  check:
  {
  "name": "ali",
  "age": 4,
  "item": {
    "name": "others",
    "count": 1
  }
}



curl --location --request POST 'localhost:8080/persons/check-rule' \
--header 'Content-Type: application/json' \
--data-raw '{
  "name": "ali",
  "age": 4,
  "item": {
    "name": "others",
    "count": 1
  }
}'
  
    
    
    
