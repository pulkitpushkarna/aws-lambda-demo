package com.lambda.demo.lambdademo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class LambdaRequestHandler implements RequestHandler<Map<String,Object>,String> {

    @Override
    public String handleRequest(Map<String, Object> input, Context context) {
        return "Hello" + input.get("name");
    }
}