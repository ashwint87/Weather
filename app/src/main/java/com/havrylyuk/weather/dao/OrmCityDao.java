package com.havrylyuk.weather.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ORM_CITY".
*/
public class OrmCityDao extends AbstractDao<OrmCity, Long> {

    public static final String TABLENAME = "ORM_CITY";

    /**
     * Properties of entity OrmCity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property _id = new Property(0, Long.class, "_id", true, "_ID");
        public final static Property City_name = new Property(1, String.class, "city_name", false, "CITY_NAME");
        public final static Property Region = new Property(2, String.class, "region", false, "REGION");
        public final static Property Country = new Property(3, String.class, "country", false, "COUNTRY");
        public final static Property Lat = new Property(4, Double.class, "lat", false, "LAT");
        public final static Property Lon = new Property(5, Double.class, "lon", false, "LON");
    }


    public OrmCityDao(DaoConfig config) {
        super(config);
    }
    
    public OrmCityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ORM_CITY\" (" + //
                "\"_ID\" INTEGER PRIMARY KEY ," + // 0: _id
                "\"CITY_NAME\" TEXT," + // 1: city_name
                "\"REGION\" TEXT," + // 2: region
                "\"COUNTRY\" TEXT," + // 3: country
                "\"LAT\" REAL," + // 4: lat
                "\"LON\" REAL);"); // 5: lon
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ORM_CITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, OrmCity entity) {
        stmt.clearBindings();
 
        Long _id = entity.get_id();
        if (_id != null) {
            stmt.bindLong(1, _id);
        }
 
        String city_name = entity.getCity_name();
        if (city_name != null) {
            stmt.bindString(2, city_name);
        }
 
        String region = entity.getRegion();
        if (region != null) {
            stmt.bindString(3, region);
        }
 
        String country = entity.getCountry();
        if (country != null) {
            stmt.bindString(4, country);
        }
 
        Double lat = entity.getLat();
        if (lat != null) {
            stmt.bindDouble(5, lat);
        }
 
        Double lon = entity.getLon();
        if (lon != null) {
            stmt.bindDouble(6, lon);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, OrmCity entity) {
        stmt.clearBindings();
 
        Long _id = entity.get_id();
        if (_id != null) {
            stmt.bindLong(1, _id);
        }
 
        String city_name = entity.getCity_name();
        if (city_name != null) {
            stmt.bindString(2, city_name);
        }
 
        String region = entity.getRegion();
        if (region != null) {
            stmt.bindString(3, region);
        }
 
        String country = entity.getCountry();
        if (country != null) {
            stmt.bindString(4, country);
        }
 
        Double lat = entity.getLat();
        if (lat != null) {
            stmt.bindDouble(5, lat);
        }
 
        Double lon = entity.getLon();
        if (lon != null) {
            stmt.bindDouble(6, lon);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public OrmCity readEntity(Cursor cursor, int offset) {
        OrmCity entity = new OrmCity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // _id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // city_name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // region
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // country
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // lat
            cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5) // lon
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, OrmCity entity, int offset) {
        entity.set_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCity_name(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setRegion(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCountry(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setLat(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setLon(cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(OrmCity entity, long rowId) {
        entity.set_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(OrmCity entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(OrmCity entity) {
        return entity.get_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
