package com.perry.basedao;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * RowMapper
 * @author zz
 * @version v1.0
 */
public interface RowMapper
{
    public Object mapRow(ResultSet rs, int index)
            throws SQLException;
}