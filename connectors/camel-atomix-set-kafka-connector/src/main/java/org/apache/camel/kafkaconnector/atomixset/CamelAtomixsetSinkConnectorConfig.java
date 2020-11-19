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
package org.apache.camel.kafkaconnector.atomixset;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAtomixsetSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_ATOMIXSET_PATH_RESOURCE_NAME_CONF = "camel.sink.path.resourceName";
    public static final String CAMEL_SINK_ATOMIXSET_PATH_RESOURCE_NAME_DOC = "The distributed resource name";
    public static final String CAMEL_SINK_ATOMIXSET_PATH_RESOURCE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_ATOMIX_CONF = "camel.sink.endpoint.atomix";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_ATOMIX_DOC = "The Atomix instance to use";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_ATOMIX_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_CONFIGURATION_URI_CONF = "camel.sink.endpoint.configurationUri";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_CONFIGURATION_URI_DOC = "The Atomix configuration uri.";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_CONFIGURATION_URI_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_ACTION_CONF = "camel.sink.endpoint.defaultAction";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_ACTION_DOC = "The default action. One of: [ADD] [CLEAR] [CONTAINS] [IS_EMPTY] [REMOVE] [SIZE]";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_ACTION_DEFAULT = "ADD";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_NODES_CONF = "camel.sink.endpoint.nodes";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_NODES_DOC = "The address of the nodes composing the cluster.";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_NODES_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_RESULT_HEADER_CONF = "camel.sink.endpoint.resultHeader";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_RESULT_HEADER_DOC = "The header that wil carry the result.";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_RESULT_HEADER_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_TRANSPORT_CLASS_NAME_CONF = "camel.sink.endpoint.transportClassName";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_TRANSPORT_CLASS_NAME_DOC = "The class name (fqn) of the Atomix transport";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_TRANSPORT_CLASS_NAME_DEFAULT = "io.atomix.catalyst.transport.netty.NettyTransport";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_TTL_CONF = "camel.sink.endpoint.ttl";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_TTL_DOC = "The resource ttl.";
    public static final Long CAMEL_SINK_ATOMIXSET_ENDPOINT_TTL_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_ATOMIXSET_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_RESOURCE_CONFIG_CONF = "camel.sink.endpoint.defaultResourceConfig";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_RESOURCE_CONFIG_DOC = "The cluster wide default resource configuration.";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_RESOURCE_CONFIG_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_RESOURCE_OPTIONS_CONF = "camel.sink.endpoint.defaultResourceOptions";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_RESOURCE_OPTIONS_DOC = "The local default resource options.";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_RESOURCE_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_EPHEMERAL_CONF = "camel.sink.endpoint.ephemeral";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_EPHEMERAL_DOC = "Sets if the local member should join groups as PersistentMember or not. If set to ephemeral the local member will receive an auto generated ID thus the local one is ignored.";
    public static final Boolean CAMEL_SINK_ATOMIXSET_ENDPOINT_EPHEMERAL_DEFAULT = false;
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_READ_CONSISTENCY_CONF = "camel.sink.endpoint.readConsistency";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_READ_CONSISTENCY_DOC = "The read consistency level. One of: [ATOMIC] [ATOMIC_LEASE] [SEQUENTIAL] [LOCAL]";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_READ_CONSISTENCY_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_RESOURCE_CONFIGS_CONF = "camel.sink.endpoint.resourceConfigs";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_RESOURCE_CONFIGS_DOC = "Cluster wide resources configuration.";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_RESOURCE_CONFIGS_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_RESOURCE_OPTIONS_CONF = "camel.sink.endpoint.resourceOptions";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_RESOURCE_OPTIONS_DOC = "Local resources configurations";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_RESOURCE_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_ATOMIXSET_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_ATOMIXSET_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_ATOMIX_CONF = "camel.component.atomix-set.atomix";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_ATOMIX_DOC = "The Atomix instance to use";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_ATOMIX_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_CONFIGURATION_CONF = "camel.component.atomix-set.configuration";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_CONFIGURATION_DOC = "The shared component configuration";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_CONFIGURATION_URI_CONF = "camel.component.atomix-set.configurationUri";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_CONFIGURATION_URI_DOC = "The path to the AtomixClient configuration";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_CONFIGURATION_URI_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_ACTION_CONF = "camel.component.atomix-set.defaultAction";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_ACTION_DOC = "The default action. One of: [ADD] [CLEAR] [CONTAINS] [IS_EMPTY] [REMOVE] [SIZE]";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_ACTION_DEFAULT = "ADD";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_NODES_CONF = "camel.component.atomix-set.nodes";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_NODES_DOC = "The nodes the AtomixClient should connect to";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_NODES_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_RESULT_HEADER_CONF = "camel.component.atomix-set.resultHeader";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_RESULT_HEADER_DOC = "The header that wil carry the result.";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_RESULT_HEADER_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_TRANSPORT_CLASS_NAME_CONF = "camel.component.atomix-set.transportClassName";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_TRANSPORT_CLASS_NAME_DOC = "The class name (fqn) of the Atomix transport";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_TRANSPORT_CLASS_NAME_DEFAULT = "io.atomix.catalyst.transport.netty.NettyTransport";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_TTL_CONF = "camel.component.atomix-set.ttl";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_TTL_DOC = "The resource ttl.";
    public static final Long CAMEL_SINK_ATOMIXSET_COMPONENT_TTL_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.atomix-set.lazyStartProducer";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_ATOMIXSET_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.atomix-set.autowiredEnabled";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_ATOMIXSET_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_RESOURCE_CONFIG_CONF = "camel.component.atomix-set.defaultResourceConfig";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_RESOURCE_CONFIG_DOC = "The cluster wide default resource configuration.";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_RESOURCE_CONFIG_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_RESOURCE_OPTIONS_CONF = "camel.component.atomix-set.defaultResourceOptions";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_RESOURCE_OPTIONS_DOC = "The local default resource options.";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_RESOURCE_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_EPHEMERAL_CONF = "camel.component.atomix-set.ephemeral";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_EPHEMERAL_DOC = "Sets if the local member should join groups as PersistentMember or not. If set to ephemeral the local member will receive an auto generated ID thus the local one is ignored.";
    public static final Boolean CAMEL_SINK_ATOMIXSET_COMPONENT_EPHEMERAL_DEFAULT = false;
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_READ_CONSISTENCY_CONF = "camel.component.atomix-set.readConsistency";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_READ_CONSISTENCY_DOC = "The read consistency level. One of: [ATOMIC] [ATOMIC_LEASE] [SEQUENTIAL] [LOCAL]";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_READ_CONSISTENCY_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_RESOURCE_CONFIGS_CONF = "camel.component.atomix-set.resourceConfigs";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_RESOURCE_CONFIGS_DOC = "Cluster wide resources configuration.";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_RESOURCE_CONFIGS_DEFAULT = null;
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_RESOURCE_OPTIONS_CONF = "camel.component.atomix-set.resourceOptions";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_RESOURCE_OPTIONS_DOC = "Local resources configurations";
    public static final String CAMEL_SINK_ATOMIXSET_COMPONENT_RESOURCE_OPTIONS_DEFAULT = null;

    public CamelAtomixsetSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAtomixsetSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_ATOMIXSET_PATH_RESOURCE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_PATH_RESOURCE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_ATOMIXSET_PATH_RESOURCE_NAME_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_ENDPOINT_ATOMIX_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_ENDPOINT_ATOMIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_ENDPOINT_ATOMIX_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_ENDPOINT_CONFIGURATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_ENDPOINT_CONFIGURATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_ENDPOINT_CONFIGURATION_URI_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_ACTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_ACTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_ACTION_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_ENDPOINT_NODES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_ENDPOINT_NODES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_ENDPOINT_NODES_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_ENDPOINT_RESULT_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_ENDPOINT_RESULT_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_ENDPOINT_RESULT_HEADER_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_ENDPOINT_TRANSPORT_CLASS_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_ENDPOINT_TRANSPORT_CLASS_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_ENDPOINT_TRANSPORT_CLASS_NAME_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_ENDPOINT_TTL_CONF, ConfigDef.Type.LONG, CAMEL_SINK_ATOMIXSET_ENDPOINT_TTL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_ENDPOINT_TTL_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATOMIXSET_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_RESOURCE_CONFIG_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_RESOURCE_CONFIG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_RESOURCE_CONFIG_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_RESOURCE_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_RESOURCE_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_ENDPOINT_DEFAULT_RESOURCE_OPTIONS_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_ENDPOINT_EPHEMERAL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATOMIXSET_ENDPOINT_EPHEMERAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_ENDPOINT_EPHEMERAL_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_ENDPOINT_READ_CONSISTENCY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_ENDPOINT_READ_CONSISTENCY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_ENDPOINT_READ_CONSISTENCY_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_ENDPOINT_RESOURCE_CONFIGS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_ENDPOINT_RESOURCE_CONFIGS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_ENDPOINT_RESOURCE_CONFIGS_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_ENDPOINT_RESOURCE_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_ENDPOINT_RESOURCE_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_ENDPOINT_RESOURCE_OPTIONS_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATOMIXSET_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_ATOMIX_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_COMPONENT_ATOMIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_ATOMIX_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_CONFIGURATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_COMPONENT_CONFIGURATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_CONFIGURATION_URI_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_ACTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_ACTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_ACTION_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_NODES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_COMPONENT_NODES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_NODES_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_RESULT_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_COMPONENT_RESULT_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_RESULT_HEADER_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_TRANSPORT_CLASS_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_COMPONENT_TRANSPORT_CLASS_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_TRANSPORT_CLASS_NAME_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_TTL_CONF, ConfigDef.Type.LONG, CAMEL_SINK_ATOMIXSET_COMPONENT_TTL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_TTL_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATOMIXSET_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATOMIXSET_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_RESOURCE_CONFIG_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_RESOURCE_CONFIG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_RESOURCE_CONFIG_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_RESOURCE_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_RESOURCE_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_DEFAULT_RESOURCE_OPTIONS_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_EPHEMERAL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATOMIXSET_COMPONENT_EPHEMERAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_EPHEMERAL_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_READ_CONSISTENCY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_COMPONENT_READ_CONSISTENCY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_READ_CONSISTENCY_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_RESOURCE_CONFIGS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_COMPONENT_RESOURCE_CONFIGS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_RESOURCE_CONFIGS_DOC);
        conf.define(CAMEL_SINK_ATOMIXSET_COMPONENT_RESOURCE_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATOMIXSET_COMPONENT_RESOURCE_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATOMIXSET_COMPONENT_RESOURCE_OPTIONS_DOC);
        return conf;
    }
}