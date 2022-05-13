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

package io.gravitee.risk.assessment.api.devices;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rémi SULTAN (remi.sultan at graviteesource.com)
 * @author GraviteeSource Team
 */
public class Devices {

    private String evaluatedDevice;
    private List<String> knownDevices = new ArrayList<>();

    public String getEvaluatedDevice() {
        return evaluatedDevice;
    }

    public List<String> getKnownDevices() {
        return knownDevices;
    }

    public Devices setEvaluatedDevice(String evaluatedDevice) {
        this.evaluatedDevice = evaluatedDevice;
        return this;
    }

    public Devices setKnownDevices(List<String> knownDevices) {
        this.knownDevices = knownDevices;
        return this;
    }
}
