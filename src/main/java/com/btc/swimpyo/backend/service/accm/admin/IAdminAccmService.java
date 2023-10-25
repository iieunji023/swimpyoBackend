package com.btc.swimpyo.backend.service.accm.admin;

import com.btc.swimpyo.backend.dto.accm.admin.AdminAccmDto;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

public interface IAdminAccmService {

    // 등록
//    public void registConfirm(AdminAccmDto adminAccmDto);
    public void registConfirm(AdminAccmDto adminAccmDto, MultipartFile a_acc_image);

    @Transactional
    void createS3(String a_acc_image, MultipartFile file);
//    String createS3(MultipartFile file);

    //상세페이지 보기
    public AdminAccmDto showAccmDetail(int a_acc_no);

    // 수정
    public int modifyConfirm(AdminAccmDto adminAccmDto);

    // 삭제
    public int deleteAccm(int a_m_no);
}
