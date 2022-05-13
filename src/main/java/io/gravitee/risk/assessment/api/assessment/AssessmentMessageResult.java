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

/**
 * @author Rémi SULTAN (remi.sultan at graviteesource.com)
 * @author GraviteeSource Team
 */
public class AssessmentMessageResult {

    private AssessmentResult<Double> devices;
    private AssessmentResult<Double> ipReputation;
    private AssessmentResult<Double> geoVelocity;

    public AssessmentResult<?> getDevices() {
        return devices;
    }

    public AssessmentResult<?> getIpReputation() {
        return ipReputation;
    }

    public AssessmentResult<?> getGeoVelocity() {
        return geoVelocity;
    }

    public AssessmentMessageResult setDevices(AssessmentResult<Double> devices) {
        this.devices = devices;
        return this;
    }

    public AssessmentMessageResult setIpReputation(AssessmentResult<Double> ipReputation) {
        this.ipReputation = ipReputation;
        return this;
    }

    public AssessmentMessageResult setGeoVelocity(AssessmentResult<Double> geoVelocity) {
        this.geoVelocity = geoVelocity;
        return this;
    }
}
