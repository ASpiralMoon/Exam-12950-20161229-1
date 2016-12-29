package com.ts.exam.dao;

import com.ts.exam.entity.Film;
import org.springframework.stereotype.Repository;

/**
 * Created by ASpiralMoon on 2016/12/29.
 */
@Repository
public interface IFilmDao {

    /**
     * 单条增加电影
     *
     * @param film 电影对象
     * @return 插入操作影响数据库行数
     */
    public int addOneFilm(Film film);

}
