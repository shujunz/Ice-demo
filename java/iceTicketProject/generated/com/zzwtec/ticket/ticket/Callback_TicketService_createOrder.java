// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.1
//
// <auto-generated>
//
// Generated from file `TicketServer.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.zzwtec.ticket.ticket;

/**
 * 下单
 **/

public abstract class Callback_TicketService_createOrder
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackBool
{
    public final void __completed(Ice.AsyncResult __result)
    {
        TicketServicePrxHelper.__createOrder_completed(this, __result);
    }
}