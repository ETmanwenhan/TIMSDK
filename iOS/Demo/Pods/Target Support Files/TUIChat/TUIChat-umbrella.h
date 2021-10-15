#ifdef __OBJC__
#import <UIKit/UIKit.h>
#else
#ifndef FOUNDATION_EXPORT
#if defined(__cplusplus)
#define FOUNDATION_EXPORT extern "C"
#else
#define FOUNDATION_EXPORT extern
#endif
#endif
#endif

#import "TUIBubbleMessageCellData.h"
#import "TUIFaceView.h"
#import "TUIInputMoreCellData.h"
#import "TUIMessageCellData.h"
#import "TUIMessageCellLayout.h"
#import "TUISystemMessageCellData.h"
#import "TUITextMessageCellData.h"
#import "TUIFaceMessageCellData.h"
#import "TUIFileMessageCellData.h"
#import "TUIGroupPendencyCellData.h"
#import "TUIImageMessageCellData.h"
#import "TUIJoinGroupMessageCellData.h"
#import "TUIMenuCellData.h"
#import "TUIMergeMessageCellData.h"
#import "TUIVideoMessageCellData.h"
#import "TUIVoiceMessageCellData.h"
#import "TUIGroupLiveMessageCellData.h"
#import "TUILinkCellData.h"
#import "TUIBubbleMessageCell.h"
#import "TUIInputMoreCell.h"
#import "TUIMessageCell.h"
#import "TUISystemMessageCell.h"
#import "TUITextMessageCell.h"
#import "TUIFaceMessageCell.h"
#import "TUIFileMessageCell.h"
#import "TUIGroupPendencyCell.h"
#import "TUIImageMessageCell.h"
#import "TUIJoinGroupMessageCell.h"
#import "TUIMenuCell.h"
#import "TUIMergeMessageCell.h"
#import "TUIVideoMessageCell.h"
#import "TUIVoiceMessageCell.h"
#import "TUIGroupLiveMessageCell.h"
#import "TUILinkCell.h"
#import "TUIChatConversationModel.h"
#import "TUIChatDataProvider.h"
#import "TUIGroupPendencyViewDataProvider.h"
#import "TUIMessageDataProvider+Call.h"
#import "TUIMessageDataProvider+Link.h"
#import "TUIMessageDataProvider+Live.h"
#import "TUIMessageDataProvider+ProtectedAPI.h"
#import "TUIMessageDataProvider.h"
#import "TUIMessageSearchDataProvider.h"
#import "TUIChatService.h"
#import "TUICameraMacro.h"
#import "TUICameraManager.h"
#import "TUICameraView.h"
#import "TUICameraViewController.h"
#import "TUICaptureImagePreviewController.h"
#import "TUICaptureTimer.h"
#import "TUICaptureVideoPreviewView.h"
#import "TUICaptureVideoPreviewViewController.h"
#import "TUIMotionManager.h"
#import "TUIMovieManager.h"
#import "TUIFileViewController.h"
#import "TUIImageViewController.h"
#import "TUIMessageControllerDelegate.h"
#import "TUIVideoViewController.h"
#import "TUIBaseChatViewController+ProtectedAPI.h"
#import "TUIBaseChatViewController.h"
#import "TUIC2CChatViewController.h"
#import "TUIGroupChatViewController.h"
#import "TUIMessageController+ProtectedAPI.h"
#import "TUIMessageController.h"
#import "TUIMessageMultiChooseView.h"
#import "TUIMessageSearchController.h"
#import "TUIMergeMessageListController.h"
#import "TUIInputBar.h"
#import "TUIInputController.h"
#import "TUIMenuView.h"
#import "TUIMoreView.h"
#import "TUIRecordView.h"
#import "TUIResponderTextView.h"
#import "TUIGroupPendencyController.h"
#import "amrFileCodec.h"
#import "dec_if.h"
#import "EMVoiceConverter.h"
#import "if_rom.h"
#import "interf_dec.h"
#import "interf_enc.h"

FOUNDATION_EXPORT double TUIChatVersionNumber;
FOUNDATION_EXPORT const unsigned char TUIChatVersionString[];
