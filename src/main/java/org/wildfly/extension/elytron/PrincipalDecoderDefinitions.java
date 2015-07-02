/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2015 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wildfly.extension.elytron;

import static org.wildfly.extension.elytron.Capabilities.PRINCIPAL_DECODER_RUNTIME_CAPABILITY;
import static org.wildfly.extension.elytron.ElytronDescriptionConstants.PRINCIPAL_DECODERS;

import org.wildfly.security.auth.util.PrincipalDecoder;

/**
 *
 * @author <a href="mailto:darran.lofthouse@jboss.com">Darran Lofthouse</a>
 */
class PrincipalDecoderDefinitions {

    private static final AggregateComponentDefinition<PrincipalDecoder> AGGREGATE_PRINCIPAL_DECODER = AggregateComponentDefinition.create(PrincipalDecoder.class,
            ElytronDescriptionConstants.AGGREGATE_PRINCIPAL_DECODER, PRINCIPAL_DECODERS, PRINCIPAL_DECODER_RUNTIME_CAPABILITY, PrincipalDecoder::aggregate);

    static AggregateComponentDefinition<PrincipalDecoder> getAggregatePrincipalDecoderDefinition() {
        return AGGREGATE_PRINCIPAL_DECODER;
    }

}