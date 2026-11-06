package com.amazon.commscore.commsidentity.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.amazon.commscore.commsidentity.database.schema.IdentityV2;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Dao
/* loaded from: classes20.dex */
public interface IdentityV2Dao {
    @Delete
    void delete(IdentityV2 identityV2);

    @Query("SELECT * FROM identityv2_table")
    List<IdentityV2> getAll();

    @Query("SELECT * FROM identityv2_table WHERE directed_id = :directedId")
    IdentityV2 getIdentityV2ForDirectedId(String str);

    @Insert(onConflict = 1)
    Long insert(IdentityV2 identityV2);
}
