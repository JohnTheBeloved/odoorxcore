package com.ehealthinformatics.odoorx.core.data.dao;

import android.content.Context;

import com.ehealthinformatics.odoorx.core.base.orm.ODataRow;
import com.ehealthinformatics.odoorx.core.base.orm.OModel;
import com.ehealthinformatics.odoorx.core.base.orm.fields.OColumn;
import com.ehealthinformatics.odoorx.core.base.orm.fields.types.OVarchar;
import com.ehealthinformatics.odoorx.core.base.support.OUser;
import com.ehealthinformatics.odoorx.core.data.db.Columns;
import com.ehealthinformatics.odoorx.core.data.db.ModelNames;
import com.ehealthinformatics.odoorx.core.data.dto.Location;

public class LocationDao extends OModel {

    OColumn name = new OColumn("Name", OVarchar.class);

    public LocationDao(Context context, OUser user) {
        super(context, ModelNames.STOCK_LOCATION, user);
    }

    public Location get(int id, QueryFields qt){
        ODataRow oDataRow = browse(id);
        return fromRow(oDataRow, qt);
    }

    @Override
    public Location fromRow(ODataRow row, QueryFields qt){
        Integer id = null;
        String name = null;
        if(qt.contains(Columns.id)) id = row.getInt(OColumn.ROW_ID);
        if(qt.contains(Columns.name)) name = row.getString(Columns.name);
        return new Location(id, name);
    }

}
