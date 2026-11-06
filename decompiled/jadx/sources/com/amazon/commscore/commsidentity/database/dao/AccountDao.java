package com.amazon.commscore.commsidentity.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.amazon.commscore.commsidentity.database.schema.Account;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Dao
/* loaded from: classes20.dex */
public interface AccountDao {
    @Delete
    void delete(Account account);

    @Query("SELECT * FROM account WHERE directed_id = :directedId")
    Account getAccountDetailsForDirectedId(String str);

    @Query("SELECT * FROM account")
    List<Account> getAll();

    @Insert(onConflict = 1)
    Long insert(Account account);
}
