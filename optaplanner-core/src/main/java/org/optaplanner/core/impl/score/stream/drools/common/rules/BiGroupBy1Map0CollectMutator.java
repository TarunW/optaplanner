/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.core.impl.score.stream.drools.common.rules;

import java.util.function.BiFunction;

final class BiGroupBy1Map0CollectMutator<A, B, NewA> extends BiGroupBy1Map1CollectMutator<A, B, NewA, Void> {

    public BiGroupBy1Map0CollectMutator(BiFunction<A, B, NewA> groupKeyMappingA) {
        super(groupKeyMappingA, null);
    }

    @Override
    public AbstractRuleAssembler apply(AbstractRuleAssembler ruleAssembler) {
        BiRuleAssembler newRuleAssembler = (BiRuleAssembler) super.apply(ruleAssembler);
        return downgrade(newRuleAssembler);
    }
}
