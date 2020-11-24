package com.shyamsundarashokfunction;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.QueueTrigger;


/**
 * Azure Functions with Queue Trigger.
 */
public class Function {

    @FunctionName("QueueTriggerDemo")
    public void run(
        @QueueTrigger(name = "item", queueName = "items-queue", connection = "AzureWebJobsStorage") String message,
        final ExecutionContext context
    ) {
        context.getLogger().info("Queue message: " + message);
    }
}
