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

/**
 * @author Rémi SULTAN (remi.sultan at graviteesource.com)
 * @author GraviteeSource Team
 */
public class RiskAssessmentSettings {

    private boolean enabled;

    private AssessmentSettings deviceAssessment;
    private AssessmentSettings ipReputationAssessment;
    private AssessmentSettings geoVelocityAssessment;

    public boolean isEnabled() {
        return enabled;
    }

    public AssessmentSettings getDeviceAssessment() {
        return deviceAssessment;
    }

    public AssessmentSettings getIpReputationAssessment() {
        return ipReputationAssessment;
    }

    public AssessmentSettings getGeoVelocityAssessment() {
        return geoVelocityAssessment;
    }

    public RiskAssessmentSettings setDeviceAssessment(AssessmentSettings deviceAssessment) {
        this.deviceAssessment = deviceAssessment;
        return this;
    }

    public RiskAssessmentSettings setIpReputationAssessment(AssessmentSettings ipReputationAssessment) {
        this.ipReputationAssessment = ipReputationAssessment;
        return this;
    }

    public RiskAssessmentSettings setGeoVelocityAssessment(AssessmentSettings geoVelocityAssessment) {
        this.geoVelocityAssessment = geoVelocityAssessment;
        return this;
    }

    public RiskAssessmentSettings setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}
