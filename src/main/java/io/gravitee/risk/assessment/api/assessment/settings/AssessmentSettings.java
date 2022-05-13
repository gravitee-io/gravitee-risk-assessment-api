/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.gravitee.risk.assessment.api.assessment.settings;

import io.gravitee.risk.assessment.api.assessment.Assessment;
import java.util.Map;

/**
 * @author Rémi SULTAN (remi.sultan at graviteesource.com)
 * @author GraviteeSource Team
 */
public class AssessmentSettings {

    private boolean enabled;
    private Map<Assessment, Double> thresholds;

    public boolean isEnabled() {
        return enabled;
    }

    public Map<Assessment, Double> getThresholds() {
        return thresholds;
    }

    public AssessmentSettings setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public AssessmentSettings setThresholds(Map<Assessment, Double> thresholds) {
        this.thresholds = thresholds;
        return this;
    }
}
