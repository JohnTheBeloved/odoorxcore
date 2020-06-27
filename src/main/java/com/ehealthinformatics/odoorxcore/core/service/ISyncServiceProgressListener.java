/**
 * Odoo, Open Source Management Solution
 * Copyright (C) 2012-today Odoo SA (<http:www.odoo.com>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http:www.gnu.org/licenses/>
 *
 * Created on 10/4/15 3:49 PM
 */
package com.ehealthinformatics.odoorxcore.core.service;

import com.ehealthinformatics.odoorxcore.core.orm.OModel;

public interface ISyncServiceProgressListener {

    public void onSyncStarted(OModel oModel);

    public void onServerListCounted(int serverCount);

    public void onServerListFetched(int totalFetched);

    public void onServerListProcessing(int totalPercentageUpdated);

    public void onUpdatingRelations(int totalPercentageUpdated);

    public void onSyncFailed(String errorMessage);

    public void onSyncTimedOut();

    public void onSyncFinished();

}