public class myDbAdapter {
    myDbHelper myhelper;
    public myDbAdapter(Context context)
    {
        myhelper = new myDbHelper(context);
    }
    public long insertData(String name, String pass)
    {
        SQLiteDatabase dbb = myhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(myDbHelper.NAME, name);
        contentValues.put(myDbHelper.MyPASSWORD, pass);
        long id = dbb.insert(myDbHelper.TABLE_NAME, null , contentValues);
        return id;
    }
    public String getData() {
        SQLiteDatabase db = myhelper.getReadableDatabase(); // Solo lectura
        String[] columns = {myDbHelper.UID, myDbHelper.NAME,
                myDbHelper.MyPASSWORD};
        Cursor cursor = db.query(myDbHelper.TABLE_NAME, columns, null, null, null, null,
                null);
        StringBuilder buffer = new StringBuilder();
        while (cursor.moveToNext()) {
            int cid = cursor.getInt(cursor.getColumnIndexOrThrow(myDbHelper.UID));
            String name =
                    cursor.getString(cursor.getColumnIndexOrThrow(myDbHelper.NAME));
            String password =
                    cursor.getString(cursor.getColumnIndexOrThrow(myDbHelper.MyPASSWORD));
            buffer.append(cid).append(" ").append(name).append("
                    ").append(password).append(" \n");
        }
        cursor.close(); // Cierra el cursor para evitar fugas de memoria
        return buffer.toString();
    }
    public int delete(String uname)
    {
        SQLiteDatabase db = myhelper.getWritableDatabase();
        String[] whereArgs ={uname};
        int count =db.delete(myDbHelper.TABLE_NAME ,myDbHelper.NAME+"
                = ?",whereArgs);
        return count;
    }
    public int updateName(String oldName , String newName)
    {
        SQLiteDatabase db = myhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(myDbHelper.NAME,newName);
        String[] whereArgs= {oldName};
        int count =db.update(myDbHelper.TABLE_NAME,contentValues,
                myDbHelper.NAME+" = ?",whereArgs );
        return count;
    }
    static class myDbHelper extends SQLiteOpenHelper
    {
        private static final String DATABASE_NAME = "myDatabase"; // Database Name
        private static final String TABLE_NAME = "myTable"; // Table Name
        private static final int DATABASE_Version = 1; // Database Version
        private static final String UID="_id"; // Column I (Primary Key)
        private static final String NAME = "Name"; //Column II
        private static final String MyPASSWORD= "Password"; // Column III
        private static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+
                " ("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+NAME+"
        VARCHAR(255) ,"+ MyPASSWORD+" VARCHAR(225));";
        private static final String DROP_TABLE ="DROP TABLE IF EXISTS "+TABLE_NAME;
        private Context context;
        public myDbHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_Version);
            this.context=context;
        }
        public void onCreate(SQLiteDatabase db) {
            try {
                db.execSQL(CREATE_TABLE);
            } catch (Exception e) {
                Message.message(context,""+e);
            }
        }
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            try {
                Message.message(context,"OnUpgrade");
                db.execSQL(DROP_TABLE);
                onCreate(db);
            }catch (Exception e) {
                Message.message(context,""+e);
            }
        }
    }
}
