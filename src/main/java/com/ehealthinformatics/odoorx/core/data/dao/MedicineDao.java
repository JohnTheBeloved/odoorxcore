package com.ehealthinformatics.odoorx.core.data.dao;

import android.content.Context;

import com.ehealthinformatics.odoorx.core.base.orm.ODataRow;
import com.ehealthinformatics.odoorx.core.base.orm.OModel;
import com.ehealthinformatics.odoorx.core.base.orm.fields.OColumn;
import com.ehealthinformatics.odoorx.core.base.orm.fields.types.OVarchar;
import com.ehealthinformatics.odoorx.core.base.support.OUser;
import com.ehealthinformatics.odoorx.core.data.db.Columns;
import com.ehealthinformatics.odoorx.core.data.dto.Medicine;

public class MedicineDao extends OModel {

    OColumn name = new OColumn("Name", OVarchar.class);

    public MedicineDao(Context context, OUser user) {
        super(context, "medicine.medicine", user);
    }

    public Medicine get(int id, QueryFields queryFields){
        ODataRow oDataRow = browse(id);
        return fromRow(oDataRow, QueryFields.id());
    }

    public Medicine fromRow(ODataRow row, QueryFields queryFields){
        if(row  == null) return null;
        Integer id = row.getInt(Columns.id);
        String name = row.getString(Columns.name);
        return new Medicine(id, name);
    }

}
