/*
 * This file is generated by jOOQ.
 */
package com.git.hui.boot.jooq.dao.tables;


import com.git.hui.boot.jooq.dao.Indexes;
import com.git.hui.boot.jooq.dao.Keys;
import com.git.hui.boot.jooq.dao.Test;
import com.git.hui.boot.jooq.dao.tables.records.UserPO;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserTB extends TableImpl<UserPO> {

    private static final long serialVersionUID = -1020999213;

    /**
     * The reference instance of <code>test.user</code>
     */
    public static final UserTB USER = new UserTB();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserPO> getRecordType() {
        return UserPO.class;
    }

    /**
     * The column <code>test.user.id</code>.
     */
    public final TableField<UserPO, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>test.user.name</code>. 用户名
     */
    public final TableField<UserPO, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(80).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "用户名");

    /**
     * The column <code>test.user.pwd</code>. 密码
     */
    public final TableField<UserPO, String> PWD = createField(DSL.name("pwd"), org.jooq.impl.SQLDataType.VARCHAR(26).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "密码");

    /**
     * The column <code>test.user.isDeleted</code>.
     */
    public final TableField<UserPO, Byte> ISDELETED = createField(DSL.name("isDeleted"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>test.user.created</code>.
     */
    public final TableField<UserPO, String> CREATED = createField(DSL.name("created"), org.jooq.impl.SQLDataType.VARCHAR(13).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>test.user.updated</code>.
     */
    public final TableField<UserPO, String> UPDATED = createField(DSL.name("updated"), org.jooq.impl.SQLDataType.VARCHAR(13).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>test.user</code> table reference
     */
    public UserTB() {
        this(DSL.name("user"), null);
    }

    /**
     * Create an aliased <code>test.user</code> table reference
     */
    public UserTB(String alias) {
        this(DSL.name(alias), USER);
    }

    /**
     * Create an aliased <code>test.user</code> table reference
     */
    public UserTB(Name alias) {
        this(alias, USER);
    }

    private UserTB(Name alias, Table<UserPO> aliased) {
        this(alias, aliased, null);
    }

    private UserTB(Name alias, Table<UserPO> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserTB(Table<O> child, ForeignKey<O, UserPO> key) {
        super(child, key, USER);
    }

    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_NAME, Indexes.USER_PRIMARY);
    }

    @Override
    public Identity<UserPO, UInteger> getIdentity() {
        return Keys.IDENTITY_USER;
    }

    @Override
    public UniqueKey<UserPO> getPrimaryKey() {
        return Keys.KEY_USER_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserPO>> getKeys() {
        return Arrays.<UniqueKey<UserPO>>asList(Keys.KEY_USER_PRIMARY);
    }

    @Override
    public UserTB as(String alias) {
        return new UserTB(DSL.name(alias), this);
    }

    @Override
    public UserTB as(Name alias) {
        return new UserTB(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserTB rename(String name) {
        return new UserTB(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserTB rename(Name name) {
        return new UserTB(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<UInteger, String, String, Byte, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
