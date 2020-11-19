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
package org.apache.camel.kafkaconnector.jt400;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelJt400SinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_JT400_PATH_USER_IDCONF = "camel.sink.path.userID";
    public static final String CAMEL_SINK_JT400_PATH_USER_IDDOC = "Returns the ID of the IBM i user.";
    public static final String CAMEL_SINK_JT400_PATH_USER_IDDEFAULT = null;
    public static final String CAMEL_SINK_JT400_PATH_PASSWORD_CONF = "camel.sink.path.password";
    public static final String CAMEL_SINK_JT400_PATH_PASSWORD_DOC = "Returns the password of the IBM i user.";
    public static final String CAMEL_SINK_JT400_PATH_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_JT400_PATH_SYSTEM_NAME_CONF = "camel.sink.path.systemName";
    public static final String CAMEL_SINK_JT400_PATH_SYSTEM_NAME_DOC = "Returns the name of the IBM i system.";
    public static final String CAMEL_SINK_JT400_PATH_SYSTEM_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_JT400_PATH_OBJECT_PATH_CONF = "camel.sink.path.objectPath";
    public static final String CAMEL_SINK_JT400_PATH_OBJECT_PATH_DOC = "Returns the fully qualified integrated file system path name of the target object of this endpoint.";
    public static final String CAMEL_SINK_JT400_PATH_OBJECT_PATH_DEFAULT = null;
    public static final String CAMEL_SINK_JT400_PATH_TYPE_CONF = "camel.sink.path.type";
    public static final String CAMEL_SINK_JT400_PATH_TYPE_DOC = "Whether to work with data queues or remote program call One of: [DTAQ] [PGM] [SRVPGM] [MSGQ]";
    public static final String CAMEL_SINK_JT400_PATH_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_JT400_ENDPOINT_CCSID_CONF = "camel.sink.endpoint.ccsid";
    public static final String CAMEL_SINK_JT400_ENDPOINT_CCSID_DOC = "Sets the CCSID to use for the connection with the IBM i system.";
    public static final Integer CAMEL_SINK_JT400_ENDPOINT_CCSID_DEFAULT = null;
    public static final String CAMEL_SINK_JT400_ENDPOINT_FORMAT_CONF = "camel.sink.endpoint.format";
    public static final String CAMEL_SINK_JT400_ENDPOINT_FORMAT_DOC = "Sets the data format for sending messages. One of: [text] [binary]";
    public static final String CAMEL_SINK_JT400_ENDPOINT_FORMAT_DEFAULT = "text";
    public static final String CAMEL_SINK_JT400_ENDPOINT_GUI_AVAILABLE_CONF = "camel.sink.endpoint.guiAvailable";
    public static final String CAMEL_SINK_JT400_ENDPOINT_GUI_AVAILABLE_DOC = "Sets whether IBM i prompting is enabled in the environment running Camel.";
    public static final Boolean CAMEL_SINK_JT400_ENDPOINT_GUI_AVAILABLE_DEFAULT = false;
    public static final String CAMEL_SINK_JT400_ENDPOINT_KEYED_CONF = "camel.sink.endpoint.keyed";
    public static final String CAMEL_SINK_JT400_ENDPOINT_KEYED_DOC = "Whether to use keyed or non-keyed data queues.";
    public static final Boolean CAMEL_SINK_JT400_ENDPOINT_KEYED_DEFAULT = false;
    public static final String CAMEL_SINK_JT400_ENDPOINT_SEARCH_KEY_CONF = "camel.sink.endpoint.searchKey";
    public static final String CAMEL_SINK_JT400_ENDPOINT_SEARCH_KEY_DOC = "Search key for keyed data queues.";
    public static final String CAMEL_SINK_JT400_ENDPOINT_SEARCH_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_JT400_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_JT400_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_JT400_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_JT400_ENDPOINT_OUTPUT_FIELDS_IDX_ARRAY_CONF = "camel.sink.endpoint.outputFieldsIdxArray";
    public static final String CAMEL_SINK_JT400_ENDPOINT_OUTPUT_FIELDS_IDX_ARRAY_DOC = "Specifies which fields (program parameters) are output parameters.";
    public static final String CAMEL_SINK_JT400_ENDPOINT_OUTPUT_FIELDS_IDX_ARRAY_DEFAULT = null;
    public static final String CAMEL_SINK_JT400_ENDPOINT_OUTPUT_FIELDS_LENGTH_ARRAY_CONF = "camel.sink.endpoint.outputFieldsLengthArray";
    public static final String CAMEL_SINK_JT400_ENDPOINT_OUTPUT_FIELDS_LENGTH_ARRAY_DOC = "Specifies the fields (program parameters) length as in the IBM i program definition.";
    public static final String CAMEL_SINK_JT400_ENDPOINT_OUTPUT_FIELDS_LENGTH_ARRAY_DEFAULT = null;
    public static final String CAMEL_SINK_JT400_ENDPOINT_PROCEDURE_NAME_CONF = "camel.sink.endpoint.procedureName";
    public static final String CAMEL_SINK_JT400_ENDPOINT_PROCEDURE_NAME_DOC = "Procedure name from a service program to call";
    public static final String CAMEL_SINK_JT400_ENDPOINT_PROCEDURE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_JT400_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_JT400_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_JT400_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_JT400_ENDPOINT_SECURED_CONF = "camel.sink.endpoint.secured";
    public static final String CAMEL_SINK_JT400_ENDPOINT_SECURED_DOC = "Whether connections to IBM i are secured with SSL.";
    public static final Boolean CAMEL_SINK_JT400_ENDPOINT_SECURED_DEFAULT = false;
    public static final String CAMEL_SINK_JT400_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.jt400.lazyStartProducer";
    public static final String CAMEL_SINK_JT400_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_JT400_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_JT400_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.jt400.autowiredEnabled";
    public static final String CAMEL_SINK_JT400_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_JT400_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_JT400_COMPONENT_CONNECTION_POOL_CONF = "camel.component.jt400.connectionPool";
    public static final String CAMEL_SINK_JT400_COMPONENT_CONNECTION_POOL_DOC = "Default connection pool used by the component. Note that this pool is lazily initialized. This is because in a scenario where the user always provides a pool, it would be wasteful for Camel to initialize and keep an idle pool.";
    public static final String CAMEL_SINK_JT400_COMPONENT_CONNECTION_POOL_DEFAULT = null;

    public CamelJt400SinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelJt400SinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_JT400_PATH_USER_IDCONF, ConfigDef.Type.STRING, CAMEL_SINK_JT400_PATH_USER_IDDEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_JT400_PATH_USER_IDDOC);
        conf.define(CAMEL_SINK_JT400_PATH_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JT400_PATH_PASSWORD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_JT400_PATH_PASSWORD_DOC);
        conf.define(CAMEL_SINK_JT400_PATH_SYSTEM_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JT400_PATH_SYSTEM_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_JT400_PATH_SYSTEM_NAME_DOC);
        conf.define(CAMEL_SINK_JT400_PATH_OBJECT_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JT400_PATH_OBJECT_PATH_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_JT400_PATH_OBJECT_PATH_DOC);
        conf.define(CAMEL_SINK_JT400_PATH_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JT400_PATH_TYPE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_JT400_PATH_TYPE_DOC);
        conf.define(CAMEL_SINK_JT400_ENDPOINT_CCSID_CONF, ConfigDef.Type.INT, CAMEL_SINK_JT400_ENDPOINT_CCSID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JT400_ENDPOINT_CCSID_DOC);
        conf.define(CAMEL_SINK_JT400_ENDPOINT_FORMAT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JT400_ENDPOINT_FORMAT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JT400_ENDPOINT_FORMAT_DOC);
        conf.define(CAMEL_SINK_JT400_ENDPOINT_GUI_AVAILABLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JT400_ENDPOINT_GUI_AVAILABLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JT400_ENDPOINT_GUI_AVAILABLE_DOC);
        conf.define(CAMEL_SINK_JT400_ENDPOINT_KEYED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JT400_ENDPOINT_KEYED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JT400_ENDPOINT_KEYED_DOC);
        conf.define(CAMEL_SINK_JT400_ENDPOINT_SEARCH_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JT400_ENDPOINT_SEARCH_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JT400_ENDPOINT_SEARCH_KEY_DOC);
        conf.define(CAMEL_SINK_JT400_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JT400_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JT400_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_JT400_ENDPOINT_OUTPUT_FIELDS_IDX_ARRAY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JT400_ENDPOINT_OUTPUT_FIELDS_IDX_ARRAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JT400_ENDPOINT_OUTPUT_FIELDS_IDX_ARRAY_DOC);
        conf.define(CAMEL_SINK_JT400_ENDPOINT_OUTPUT_FIELDS_LENGTH_ARRAY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JT400_ENDPOINT_OUTPUT_FIELDS_LENGTH_ARRAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JT400_ENDPOINT_OUTPUT_FIELDS_LENGTH_ARRAY_DOC);
        conf.define(CAMEL_SINK_JT400_ENDPOINT_PROCEDURE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JT400_ENDPOINT_PROCEDURE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JT400_ENDPOINT_PROCEDURE_NAME_DOC);
        conf.define(CAMEL_SINK_JT400_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JT400_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JT400_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_JT400_ENDPOINT_SECURED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JT400_ENDPOINT_SECURED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JT400_ENDPOINT_SECURED_DOC);
        conf.define(CAMEL_SINK_JT400_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JT400_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JT400_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_JT400_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JT400_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JT400_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_JT400_COMPONENT_CONNECTION_POOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JT400_COMPONENT_CONNECTION_POOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JT400_COMPONENT_CONNECTION_POOL_DOC);
        return conf;
    }
}