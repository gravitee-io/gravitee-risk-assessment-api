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

package io.gravitee.risk.assessment.api.assessment.data;

import io.gravitee.risk.assessment.api.devices.Devices;
import io.gravitee.risk.assessment.api.geovelocity.GeoTimeCoordinate;
import java.util.List;

/**
 * @author Rémi SULTAN (remi.sultan at graviteesource.com)
 * @author GraviteeSource Team
 */
public class AssessmentData {

    private List<GeoTimeCoordinate> geoTimeCoordinates;
    private Devices devices;
    private String currentIp;

    public List<GeoTimeCoordinate> getGeoTimeCoordinates() {
        return geoTimeCoordinates;
    }

    public Devices getDevices() {
        return devices;
    }

    public String getCurrentIp() {
        return currentIp;
    }

    public AssessmentData setGeoTimeCoordinates(List<GeoTimeCoordinate> geoTimeCoordinates) {
        this.geoTimeCoordinates = geoTimeCoordinates;
        return this;
    }

    public AssessmentData setDevices(Devices devices) {
        this.devices = devices;
        return this;
    }

    public AssessmentData setCurrentIp(String currentIp) {
        this.currentIp = currentIp;
        return this;
    }
}
