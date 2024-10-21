package com.example;

import com.amazonaws.services.lambda.runtime.Context;
// //import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
        return Utility.sayHello("Lambda");
    }
}


// public class LambdaHandler  {

// //     @Override
//     public static void main() {
//         System.out.println(Utility.sayHello("Lambda"));
//     }
// }

