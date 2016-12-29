package com.ts.exam.service.impl;

import com.ts.exam.dao.IFilmDao;
import com.ts.exam.entity.Film;
import com.ts.exam.service.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ASpiralMoon on 2016/12/29.
 */
@Service
public class IFilmServiceImpl implements IFilmService {

    @Autowired
    private IFilmDao iFilmDao;
    @Autowired
    private Film film;

    @Override
    public boolean addFilm(String title, String description, Byte languageId) {
        film.setTitle(title);
        film.setDescription(description);
        film.setLanguageId(languageId);
        int i = iFilmDao.addOneFilm(film);
        if (i == 1) {
            return true;
        }
        return false;
    }

}
