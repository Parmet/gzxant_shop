/**
 * 校验工具
 */
var validate = {
	// 判断是否为空
	isNotEmpty: function(verified) {
		return !validate.isEmpty(verified);
	},
	isEmpty: function(verified) {
		if (validate.isArray(verified)) {
			return (verified.length == 0);
		}
		
	    if (validate.isString(verified) 
	        && (verified === "" 
		        || verified === null 
		        || typeof verified === 'undefined')) {
	        return true;
	    }
	    
	    if (validate.isObject(verified)) {
	    	return (JSON.stringify(verified) == "{}");
	    }
	    
	    return false;
	},
	isArray: function(verified) {
		return (Object.prototype.toString.call(verified) == '[object Array]');
	},
	isString: function(verified) {
		return (Object.prototype.toString.call(verified) === "[object String]");
	},
	isObject: function(verified) {
		return (Object.prototype.toString.call(verified).toLowerCase() == "[object object]");
	}
}