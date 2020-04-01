/*
 * (C) Copyright T-Systems Multimedia Solutions GmbH 2018, ..
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
 *
 * Contributors:
 *     Peter Lehmann <p.lehmann@t-systems.com>
 *     pele <p.lehmann@t-systems.com>
 */
package eu.tsystems.mms.tic.testframework.qcconnector.constants;

/**
 * User: rnhb Date: 19.12.13
 */
public enum QCTestStatus {
    PASSED("Passed"),
    NORUN("No Run"),
    EMPTY(""),
    FAILED("Failed");

    private String status;

    private QCTestStatus(String status) {
        this.status = status;
    }

    /**
     * gets status as string
     *
     * @return status
     */
    public String toString() {
        return status;
    }
}
