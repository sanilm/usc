package com.igate.xyz.service;

import java.util.List;


import com.igate.xyz.bean.MovementReqDetails;
import com.igate.xyz.exception.XyzException;

public interface IXyzService {
public int addMR(MovementReqDetails details) throws XyzException;
public List<MovementReqDetails> displayselected(MovementReqDetails details) throws XyzException;
}
