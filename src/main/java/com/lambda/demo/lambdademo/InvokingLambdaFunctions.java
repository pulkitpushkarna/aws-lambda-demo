package com.lambda.demo.lambdademo;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;

import java.io.UnsupportedEncodingException;


public class InvokingLambdaFunctions {

    public static void main(String[] args) throws UnsupportedEncodingException {


        AWSLambda client = AWSLambdaClientBuilder
                .standard()
                .withRegion(Regions.AP_SOUTH_1)
                .build();

        InvokeRequest req = new InvokeRequest()
                .withFunctionName("LambdaFunctionDemo")
                .withPayload("{ \"name\":\" Pulkit\" }"); // optional

        InvokeResult invokeResult = client.invoke(req);
        System.out.println(invokeResult);
        System.out.println(invokeResult.getPayload());

        String converted = new String(invokeResult.getPayload().array(), "UTF-8");
        System.out.println(converted);

    }
}
