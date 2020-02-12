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
import org.apache.camel.component.etcd.EtcdStatsComponent;

/**
 * The camel etcd component allows you to work with Etcd, a distributed reliable
 * key-value store.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface EtcdStatsComponentBuilderFactory {

    /**
     * Etcd Stats (camel-etcd)
     * The camel etcd component allows you to work with Etcd, a distributed
     * reliable key-value store.
     * 
     * Category: clustering,database
     * Since: 2.18
     * Maven coordinates: org.apache.camel:camel-etcd
     */
    static EtcdStatsComponentBuilder etcdStats() {
        return new EtcdStatsComponentBuilderImpl();
    }

    /**
     * Builder for the Etcd Stats component.
     */
    interface EtcdStatsComponentBuilder
            extends
                ComponentBuilder<EtcdStatsComponent> {
        /**
         * The password to use for basic authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default EtcdStatsComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: common
         */
        default EtcdStatsComponentBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To set the URIs the client connects.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default EtcdStatsComponentBuilder uris(java.lang.String uris) {
            doSetProperty("uris", uris);
            return this;
        }
        /**
         * The user name to use for basic authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default EtcdStatsComponentBuilder userName(java.lang.String userName) {
            doSetProperty("userName", userName);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default EtcdStatsComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
        default EtcdStatsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
        default EtcdStatsComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets the common configuration shared among endpoints.
         * 
         * The option is a:
         * <code>org.apache.camel.component.etcd.EtcdConfiguration</code> type.
         * 
         * Group: advanced
         */
        default EtcdStatsComponentBuilder configuration(
                org.apache.camel.component.etcd.EtcdConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Enable usage of global SSL context parameters.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: security
         */
        default EtcdStatsComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
    }

    class EtcdStatsComponentBuilderImpl
            extends
                AbstractComponentBuilder<EtcdStatsComponent>
            implements
                EtcdStatsComponentBuilder {
        @Override
        protected EtcdStatsComponent buildConcreteComponent() {
            return new EtcdStatsComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "password": ((EtcdStatsComponent) component).setPassword((java.lang.String) value); return true;
            case "sslContextParameters": ((EtcdStatsComponent) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "uris": ((EtcdStatsComponent) component).setUris((java.lang.String) value); return true;
            case "userName": ((EtcdStatsComponent) component).setUserName((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((EtcdStatsComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((EtcdStatsComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((EtcdStatsComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "configuration": ((EtcdStatsComponent) component).setConfiguration((org.apache.camel.component.etcd.EtcdConfiguration) value); return true;
            case "useGlobalSslContextParameters": ((EtcdStatsComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            default: return false;
            }
        }
    }
}