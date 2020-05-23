/*
 * Corona-Warn-App
 *
 * SAP SE and all other contributors /
 * copyright owners license this file to you under the Apache
 * License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package app.coronawarn.server.services.distribution.persistence.service;

import app.coronawarn.server.services.distribution.persistence.domain.ExportBatch;
import app.coronawarn.server.services.distribution.persistence.repository.ExportBatchRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class ExportBatchService {

  private final ExportBatchRepository exportBatchRepository;

  // @Autowired
  public ExportBatchService(ExportBatchRepository exportBatchRepository) {
    this.exportBatchRepository = exportBatchRepository;
  }

  /**
   * Saves an export batch to the database.
   *
   * @param exportBatch The export batch, that needs to be saved
   */
  public void saveExportBatch(ExportBatch exportBatch) {
    exportBatchRepository.save(exportBatch);
  }

  /**
   * Returns all export batches saved on the database.
   *
   * @return List of all export batches.
   */
  public List<ExportBatch> getExportBatches() {
    return exportBatchRepository.findAll();
  }

}