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
package org.apache.camel.kafkaconnector.zookeeper;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelZookeeperSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_ZOOKEEPER_PATH_SERVER_URLS_CONF = "camel.source.path.serverUrls";
    public static final String CAMEL_SOURCE_ZOOKEEPER_PATH_SERVER_URLS_DOC = "The zookeeper server hosts (multiple servers can be separated by comma)";
    public static final String CAMEL_SOURCE_ZOOKEEPER_PATH_SERVER_URLS_DEFAULT = null;
    public static final String CAMEL_SOURCE_ZOOKEEPER_PATH_PATH_CONF = "camel.source.path.path";
    public static final String CAMEL_SOURCE_ZOOKEEPER_PATH_PATH_DOC = "The node in the ZooKeeper server (aka znode)";
    public static final String CAMEL_SOURCE_ZOOKEEPER_PATH_PATH_DEFAULT = null;
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_LIST_CHILDREN_CONF = "camel.source.endpoint.listChildren";
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_LIST_CHILDREN_DOC = "Whether the children of the node should be listed";
    public static final Boolean CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_LIST_CHILDREN_DEFAULT = false;
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_TIMEOUT_CONF = "camel.source.endpoint.timeout";
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_TIMEOUT_DOC = "The time interval to wait on connection before timing out.";
    public static final Integer CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_TIMEOUT_DEFAULT = 5000;
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_BACKOFF_CONF = "camel.source.endpoint.backoff";
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_BACKOFF_DOC = "The time interval to backoff for after an error before retrying.";
    public static final Long CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_BACKOFF_DEFAULT = 5000L;
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_REPEAT_CONF = "camel.source.endpoint.repeat";
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_REPEAT_DOC = "Should changes to the znode be 'watched' and repeatedly processed.";
    public static final Boolean CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_REPEAT_DEFAULT = false;
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_SEND_EMPTY_MESSAGE_ON_DELETE_CONF = "camel.source.endpoint.sendEmptyMessageOnDelete";
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_SEND_EMPTY_MESSAGE_ON_DELETE_DOC = "Upon the delete of a znode, should an empty message be send to the consumer";
    public static final Boolean CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_SEND_EMPTY_MESSAGE_ON_DELETE_DEFAULT = true;
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_LIST_CHILDREN_CONF = "camel.component.zookeeper.listChildren";
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_LIST_CHILDREN_DOC = "Whether the children of the node should be listed";
    public static final Boolean CAMEL_SOURCE_ZOOKEEPER_COMPONENT_LIST_CHILDREN_DEFAULT = false;
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_TIMEOUT_CONF = "camel.component.zookeeper.timeout";
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_TIMEOUT_DOC = "The time interval to wait on connection before timing out.";
    public static final Integer CAMEL_SOURCE_ZOOKEEPER_COMPONENT_TIMEOUT_DEFAULT = 5000;
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_BACKOFF_CONF = "camel.component.zookeeper.backoff";
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_BACKOFF_DOC = "The time interval to backoff for after an error before retrying.";
    public static final Long CAMEL_SOURCE_ZOOKEEPER_COMPONENT_BACKOFF_DEFAULT = 5000L;
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.zookeeper.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_ZOOKEEPER_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_REPEAT_CONF = "camel.component.zookeeper.repeat";
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_REPEAT_DOC = "Should changes to the znode be 'watched' and repeatedly processed.";
    public static final Boolean CAMEL_SOURCE_ZOOKEEPER_COMPONENT_REPEAT_DEFAULT = false;
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_SEND_EMPTY_MESSAGE_ON_DELETE_CONF = "camel.component.zookeeper.sendEmptyMessageOnDelete";
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_SEND_EMPTY_MESSAGE_ON_DELETE_DOC = "Upon the delete of a znode, should an empty message be send to the consumer";
    public static final Boolean CAMEL_SOURCE_ZOOKEEPER_COMPONENT_SEND_EMPTY_MESSAGE_ON_DELETE_DEFAULT = true;
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.zookeeper.autowiredEnabled";
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_ZOOKEEPER_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_CONFIGURATION_CONF = "camel.component.zookeeper.configuration";
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_CONFIGURATION_DOC = "To use a shared ZooKeeperConfiguration";
    public static final String CAMEL_SOURCE_ZOOKEEPER_COMPONENT_CONFIGURATION_DEFAULT = null;

    public CamelZookeeperSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelZookeeperSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_ZOOKEEPER_PATH_SERVER_URLS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ZOOKEEPER_PATH_SERVER_URLS_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_ZOOKEEPER_PATH_SERVER_URLS_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_PATH_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ZOOKEEPER_PATH_PATH_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_ZOOKEEPER_PATH_PATH_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_LIST_CHILDREN_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_LIST_CHILDREN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_LIST_CHILDREN_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_BACKOFF_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_BACKOFF_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_BACKOFF_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_REPEAT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_REPEAT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_REPEAT_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_SEND_EMPTY_MESSAGE_ON_DELETE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_SEND_EMPTY_MESSAGE_ON_DELETE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_SEND_EMPTY_MESSAGE_ON_DELETE_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_COMPONENT_LIST_CHILDREN_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_LIST_CHILDREN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_LIST_CHILDREN_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_COMPONENT_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_COMPONENT_BACKOFF_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_BACKOFF_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_BACKOFF_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_COMPONENT_REPEAT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_REPEAT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_REPEAT_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_COMPONENT_SEND_EMPTY_MESSAGE_ON_DELETE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_SEND_EMPTY_MESSAGE_ON_DELETE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_SEND_EMPTY_MESSAGE_ON_DELETE_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_ZOOKEEPER_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ZOOKEEPER_COMPONENT_CONFIGURATION_DOC);
        return conf;
    }
}