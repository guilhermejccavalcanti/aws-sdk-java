/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudfront_2012_03_15.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.cloudfront_2012_03_15.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Get Cloud Front Origin Access Identity Config Result StAX Unmarshaller
 */
public class GetCloudFrontOriginAccessIdentityConfigResultStaxUnmarshaller implements Unmarshaller<GetCloudFrontOriginAccessIdentityConfigResult, StaxUnmarshallerContext> {

    public GetCloudFrontOriginAccessIdentityConfigResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfigResult = new GetCloudFrontOriginAccessIdentityConfigResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            getCloudFrontOriginAccessIdentityConfigResult.setETag(context.getHeader("ETag"));
        }
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return getCloudFrontOriginAccessIdentityConfigResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("CloudFrontOriginAccessIdentityConfig", targetDepth)) {
                    getCloudFrontOriginAccessIdentityConfigResult.setCloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getCloudFrontOriginAccessIdentityConfigResult;
                }
            }
        }
    }

    private static GetCloudFrontOriginAccessIdentityConfigResultStaxUnmarshaller instance;
    public static GetCloudFrontOriginAccessIdentityConfigResultStaxUnmarshaller getInstance() {
        if (instance == null) instance = new GetCloudFrontOriginAccessIdentityConfigResultStaxUnmarshaller();
        return instance;
    }
}
    
