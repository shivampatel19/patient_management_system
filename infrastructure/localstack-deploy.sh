#!/bin/bash
set -e  # Exit on any error

## Set default AWS credentials for LocalStack
#export AWS_ACCESS_KEY_ID=test
#export AWS_SECRET_ACCESS_KEY=test
#export AWS_DEFAULT_REGION=us-east-1

# Delete existing stack (if any)
#aws --endpoint-url=http://localhost:4566 cloudformation delete-stack \
#    --stack-name patient-management

# Deploy new stack
aws --endpoint-url=http://localhost:4566 cloudformation deploy \
    --stack-name patient-management \
    --template-file "./cdk.out/localstack.template.json"

# Fetch Load Balancer DNS name
aws --endpoint-url=http://localhost:4566 elbv2 describe-load-balancers \
    --query "LoadBalancers[0].DNSName" --output text
