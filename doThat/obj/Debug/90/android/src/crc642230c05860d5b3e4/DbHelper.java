package crc642230c05860d5b3e4;


public class DbHelper
	extends android.database.sqlite.SQLiteOpenHelper
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/database/sqlite/SQLiteDatabase;)V:GetOnCreate_Landroid_database_sqlite_SQLiteDatabase_Handler\n" +
			"n_onUpgrade:(Landroid/database/sqlite/SQLiteDatabase;II)V:GetOnUpgrade_Landroid_database_sqlite_SQLiteDatabase_IIHandler\n" +
			"";
		mono.android.Runtime.register ("doThat.Helper.DbHelper, doThat", DbHelper.class, __md_methods);
	}


	public DbHelper (android.content.Context p0, java.lang.String p1, android.database.sqlite.SQLiteDatabase.CursorFactory p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == DbHelper.class)
			mono.android.TypeManager.Activate ("doThat.Helper.DbHelper, doThat", "Android.Content.Context, Mono.Android:System.String, mscorlib:Android.Database.Sqlite.SQLiteDatabase+ICursorFactory, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public DbHelper (android.content.Context p0, java.lang.String p1, android.database.sqlite.SQLiteDatabase.CursorFactory p2, int p3, android.database.DatabaseErrorHandler p4)
	{
		super (p0, p1, p2, p3, p4);
		if (getClass () == DbHelper.class)
			mono.android.TypeManager.Activate ("doThat.Helper.DbHelper, doThat", "Android.Content.Context, Mono.Android:System.String, mscorlib:Android.Database.Sqlite.SQLiteDatabase+ICursorFactory, Mono.Android:System.Int32, mscorlib:Android.Database.IDatabaseErrorHandler, Mono.Android", this, new java.lang.Object[] { p0, p1, p2, p3, p4 });
	}


	public DbHelper (android.content.Context p0, java.lang.String p1, int p2, android.database.sqlite.SQLiteDatabase.OpenParams p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == DbHelper.class)
			mono.android.TypeManager.Activate ("doThat.Helper.DbHelper, doThat", "Android.Content.Context, Mono.Android:System.String, mscorlib:System.Int32, mscorlib:Android.Database.Sqlite.SQLiteDatabase+OpenParams, Mono.Android", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void onCreate (android.database.sqlite.SQLiteDatabase p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.database.sqlite.SQLiteDatabase p0);


	public void onUpgrade (android.database.sqlite.SQLiteDatabase p0, int p1, int p2)
	{
		n_onUpgrade (p0, p1, p2);
	}

	private native void n_onUpgrade (android.database.sqlite.SQLiteDatabase p0, int p1, int p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
