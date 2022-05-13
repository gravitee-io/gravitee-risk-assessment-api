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

package io.gravitee.risk.assessment.api.assessment;

import io.gravitee.risk.assessment.api.assessment.data.AssessmentData;
import io.gravitee.risk.assessment.api.assessment.settings.RiskAssessmentSettings;

/**
 * @author Rémi SULTAN (remi.sultan at graviteesource.com)
 * @author GraviteeSource Team
 */
public class AssessmentMessage {

    private RiskAssessmentSettings settings;
    private AssessmentData data;

    public RiskAssessmentSettings getSettings() {
        return settings;
    }

    public AssessmentData getData() {
        return data;
    }

    public AssessmentMessage setSettings(RiskAssessmentSettings settings) {
        this.settings = settings;
        return this;
    }

    public AssessmentMessage setData(AssessmentData data) {
        this.data = data;
        return this;
    }
}
