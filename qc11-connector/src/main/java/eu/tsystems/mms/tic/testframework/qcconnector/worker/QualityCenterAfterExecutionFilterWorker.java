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
package eu.tsystems.mms.tic.testframework.qcconnector.worker;

import eu.tsystems.mms.tic.testframework.common.PropertyManager;
import eu.tsystems.mms.tic.testframework.execution.testng.worker.MethodWorker;
import eu.tsystems.mms.tic.testframework.qcconnector.constants.ErrorMessages;

/**
 * Created by pele on 19.01.2017.
 */
public class QualityCenterAfterExecutionFilterWorker extends MethodWorker {

    @Override
    public void run() {

        if (isTest()) {
            final Throwable throwable = testResult.getThrowable();
            if (isSkipped()
                    && throwable != null
                    && throwable.getMessage() != null
                    && throwable.getMessage().contains(ErrorMessages.skippedByQcExecutionFilter())) {
                String filter = PropertyManager.getProperty("qc.test.execution.filter", "");
                methodContext.addPriorityMessage("Test didn't run. It has been filtered by your qc execution filter settings."
                        + filter);
            }
        }
    }
}
