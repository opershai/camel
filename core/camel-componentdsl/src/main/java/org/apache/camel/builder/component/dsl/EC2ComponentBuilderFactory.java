/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws.ec2.EC2Component;

/**
 * The aws-ec2 is used for managing Amazon EC2 instances.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface EC2ComponentBuilderFactory {

    /**
     * AWS EC2 (camel-aws-ec2)
     * The aws-ec2 is used for managing Amazon EC2 instances.
     * 
     * Category: cloud,management
     * Since: 2.16
     * Maven coordinates: org.apache.camel:camel-aws-ec2
     */
    static EC2ComponentBuilder awsEc2() {
        return new EC2ComponentBuilderImpl();
    }

    /**
     * Builder for the AWS EC2 component.
     */
    interface EC2ComponentBuilder extends ComponentBuilder<EC2Component> {
        /**
         * The AWS EC2 default configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.ec2.EC2Configuration</code>
         * type.
         * 
         * Group: advanced
         */
        default EC2ComponentBuilder configuration(
                org.apache.camel.component.aws.ec2.EC2Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The region in which EC2 client needs to work.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default EC2ComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default EC2ComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default EC2ComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default EC2ComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default EC2ComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    class EC2ComponentBuilderImpl
            extends
                AbstractComponentBuilder<EC2Component>
            implements
                EC2ComponentBuilder {
        @Override
        protected EC2Component buildConcreteComponent() {
            return new EC2Component();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((EC2Component) component).setConfiguration((org.apache.camel.component.aws.ec2.EC2Configuration) value); return true;
            case "region": ((EC2Component) component).setRegion((java.lang.String) value); return true;
            case "accessKey": ((EC2Component) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": ((EC2Component) component).setSecretKey((java.lang.String) value); return true;
            case "basicPropertyBinding": ((EC2Component) component).setBasicPropertyBinding((boolean) value); return true;
            case "lazyStartProducer": ((EC2Component) component).setLazyStartProducer((boolean) value); return true;
            default: return false;
            }
        }
    }
}