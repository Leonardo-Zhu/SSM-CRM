package dao;

import pojo.BaseDict;

import java.util.List;

public interface DictMapper {
    List<BaseDict> findDictByCode(String code);
}
