/* 
 * Copyright 2015 pritchie.
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
package Utils;

import Models.Host;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pritchie
 */
public class AffectedHostsTableModel extends DefaultTableModel {

    Class[] types = new Class[]{
        Host.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
    };

    public AffectedHostsTableModel() {
        super(new Object[][]{}, new String[]{"IP Address", "Hostname", "Portnumber", "Protocol"});
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}