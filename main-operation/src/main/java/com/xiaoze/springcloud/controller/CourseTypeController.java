package com.xiaoze.springcloud.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoze.springcloud.entity.CourseType;
import com.xiaoze.springcloud.service.CourseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * CourseTypeController
 *
 * @author xiaoze
 * @date 2018/6/3
 *
 */
@RestController
public class CourseTypeController {

    @Autowired
    private CourseTypeService courseTypeService ;


    @PostMapping(value="/createCourseType")
    public String createCourseType(@RequestBody CourseType coueseType) {

        courseTypeService.addCourseType(coueseType);

        return "true";
    }

    @PostMapping("/list/{pageNo}")
    public PageInfo<CourseType> list(@PathVariable("pageNo") Integer pageNo) {

        /*
         * 第一个参数：第几页;
         * 第二个参数：每页获取的条数.
         */
        PageHelper.startPage(pageNo, 3);
        List<CourseType> courseTypeList = courseTypeService.loadAll();

        PageInfo<CourseType> page=new PageInfo<>(courseTypeList);

        return page;
    }

    @DeleteMapping(value="/removeCourseType/{typeId}")
    public String removeCourseType(@PathVariable("typeId") Integer typeId) {

        courseTypeService.removeCourseType(typeId);

        return "true";
    }

    @GetMapping(value="/getOneCourseType/{typeId}")
    public CourseType getOneCourseType(@PathVariable("typeId") Integer typeId) {

        return courseTypeService.getCourseTypeById(typeId);
    }

    @PutMapping(value="/updateCourseType")
    public String updateCourseType(@RequestBody CourseType coueseType) {

        courseTypeService.updateCourseType(coueseType);

        return "true";
    }


}
