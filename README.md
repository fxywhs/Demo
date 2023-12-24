# demo
tax calculator demo
# GitHub URL
https://github.com/fxywhs/demo.git
# How to Build
- Go to directory where pom.xml is located
- run command: mvn clean package
# How to run application
- Go to directory where jar generated by build is located
- run command: java -jar taxcalculator-0.0.1-SNAPSHOT.jar
# Request sample
GET Method: http://localhost:8080/tax?annualIncome=18000
# Response sampe
{
    "taxAmount": 130.0,
    "taxSlab": {
        "category": "B",
        "chargeableIncome": {
            "top": 20000.0,
            "bottom": 5001.0
        },
        "rates": [
            {
                "amount": 5000.0,
                "rate": null,
                "taxAmount": 0.0
            },
            {
                "amount": 15000.0,
                "rate": 1.0,
                "taxAmount": null
            }
        ]
    },
    "taxClaimOptions": [
        {
            "description": "Individual and dependent relatives",
            "amount": 9000.0
        },
        {
            "description": "Medical Treatment",
            "amount": 8000.0
        },
        {
            "description": "Purchase of basic supporting equipment for disabled self, spouse, child or parent",
            "amount": 6000.0
        },
        {
            "description": "Disabled individual",
            "amount": 6000.0
        },
        {
            "description": "Education fees (Self)",
            "amount": 7000.0
        },
        {
            "description": "Medical expenses for family",
            "amount": 10000.0
        },
        {
            "description": "Lifestyle",
            "amount": 2500.0
        },
        {
            "description": "Lifestyle - additional",
            "amount": 500.0
        }
    ]
}
