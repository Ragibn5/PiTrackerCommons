package com.vivasoft.pitrackercommons.constants;

import com.vivasoft.pitrackercommons.models.PackageConfig;

public final class RequestCodes {
  /**
   * Requires the message object to have a bundle with the following:
   * <b>packageName</b><br>
   * Package name of the requesting package.
   */
  public static final int RETURN_MY_CONFIG = 101;


  /**
   * Requires the message object to have a bundle with the following:
   * <b>packageName</b><br>
   * Package name of the requesting package.
   * <br><br>
   * <b>packageConfig</b><br>
   * Configuration of type {@link PackageConfig}
   */
  public static final int CREATE_MY_CONFIG = 102;
}
